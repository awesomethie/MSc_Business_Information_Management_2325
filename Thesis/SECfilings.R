# Load the package
library(edgar)

# Define user agent (edit with your real info)
useragent <- "Thy Cao v.thy1699@gmail.com"

# Define the cleaned list of CIKs (integers, no leading zeros)
cik_list <- c(
  1090872, 796343, 769397, 1577526, 1701732, 2488, 1013462, 1368622, 1730168, 1897982,
  1577552, 1329099, 1280058, 1100682, 858877, 29905, 1297989, 40533, 1557860, 1652044,
  773840, 51143, 1067491, 1039765, 50863, 1357615, 319201, 1409970, 855658, 1141391,
  1613103, 1099590, 1326801, 789019, 1736541, 1133421, 1373715, 1002047, 1110646, 1045810,
  1341439, 1002638, 1734722, 1474432, 857005, 804328, 1000184, 1375365, 1564408, 1605484,
  932787, 1137789, 310764, 816761, 1094517, 1318605, 1111335, 1124610, 1595761, 1530238,
  1136869, 877212
)

# Define the years of interest
years <- 2013:2023

# Split CIKs into batches of 10 to avoid overwhelming the SEC server
batch_size <- 10
cik_batches <- split(cik_list, ceiling(seq_along(cik_list) / batch_size))

# Loop through each batch and each year to download 10-K filings
for (batch in cik_batches) {
  for (year in years) {
    message("Downloading for year ", year, ", CIKs: ", paste(batch, collapse = ", "))
    tryCatch({
      getFilings(
        cik.no = batch,
        form.type = "10-K",
        filing.year = year,
        quarter = c(1, 2, 3, 4),
        downl.permit = "y",
        useragent = useragent
      )
      Sys.sleep(2)  # polite pause between requests
    }, error = function(e) {
      message("Error for year ", year, ": ", e$message)
    })
  }
}