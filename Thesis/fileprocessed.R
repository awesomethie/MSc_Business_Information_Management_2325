# Load necessary package
if (!require("stringr")) install.packages("stringr")
library(stringr)

# Set root input and output directories
input_dir <- "/Users/awesomethie/Downloads/edgar_Filings/Form 20-F"          # Replace this
output_dir <- "/Users/awesomethie/Downloads/edgar_Filings/Form 20-F"        # Replace this



# List all .txt files in nested folders
files <- list.files(input_dir, pattern = "\\.txt$", full.names = TRUE, recursive = TRUE)

# Loop through files
for (file in files) {
  # Read and combine content
  text <- readLines(file, warn = FALSE)
  text <- paste(text, collapse = "\n")
  
  # Remove XML/XBRL/HTML tags
  text_clean <- str_remove_all(text, "<[^>]+>")
  
  # Remove SEC header/footer
  text_clean <- str_remove_all(text_clean, "(?i)<SEC-HEADER>.*?</SEC-HEADER>")
  text_clean <- str_remove_all(text_clean, "(?i)<SEC-DOCUMENT>.*?</SEC-DOCUMENT>")
  
  # Clean whitespace and lowercase
  text_clean <- gsub("[\r\n]+", "\n", text_clean)
  text_clean <- str_squish(text_clean)
  text_clean <- tolower(text_clean)
  
  # Recreate subfolder structure in output_dir
  relative_path <- gsub(paste0("^", input_dir), "", file)
  output_file_path <- file.path(output_dir, relative_path)
  output_subdir <- dirname(output_file_path)
  
  if (!dir.exists(output_subdir)) dir.create(output_subdir, recursive = TRUE)
  
  # Write cleaned file
  writeLines(text_clean, output_file_path)
}

cat("✅ Done! Cleaned files saved to:", output_dir, "\n")