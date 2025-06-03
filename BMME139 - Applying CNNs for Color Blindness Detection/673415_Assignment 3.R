#if (!require("BiocManager", quietly = TRUE))
#install.packages("BiocManager")

#BiocManager::install("EBImage")

#install.packages("imager")

library(keras3)
library(EBImage)
library(imager)
library(magrittr)

getwd()
# Read images
setwd("/Users/awesomethie/Downloads/Deep Learning/Assignment 3/ordered")
getwd()
temp <- list.files(path = "/Users/awesomethie/Downloads/Deep Learning/Assignment 3/ordered ", pattern="*.jpg")
mypicHigh <- list()