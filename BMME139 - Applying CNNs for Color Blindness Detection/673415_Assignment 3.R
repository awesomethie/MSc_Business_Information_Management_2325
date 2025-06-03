#if (!require("BiocManager", quietly = TRUE))
#install.packages("BiocManager")

#BiocManager::install("EBImage")

#install.packages("imager")

library(keras3)
library(EBImage)
library(imager)
library(magrittr)

getwd()
