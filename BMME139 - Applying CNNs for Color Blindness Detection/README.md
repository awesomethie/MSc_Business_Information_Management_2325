# 🧠 Color Blindness Detection Using CNNs
## 📘 Individual Project – Machine Learning Applications  
---

## 📌 Project Overview

This project explores the use of **Convolutional Neural Networks (CNNs)** to classify images from the Ishihara Color Blindness Chart. A baseline CNN model was implemented and iteratively improved using data augmentation and architectural tuning. The goal was to investigate how various CNN configurations affect classification accuracy on small-scale medical image datasets.

---

## 🧪 Key Methods & Models

### 📊 Dataset
- **Source**: Kaggle – “Ishihara Color Blindness Chart Dataset” (subset by Gupta, 2023)
- **Classes**: 9 different digit-based categories
- **Size**: Initially 53 images, expanded to 495 with external augmentation

### 🏗️ Baseline CNN Architecture
- Input: 128x128x4 images (RGBA)
- Conv2D layers → MaxPooling → Dense layers → Dropout
- Softmax output for multi-class classification

### 🔧 Improvements
- **Model 2**: Data augmentation (flip, rotate, zoom, contrast, brightness, translation)
- **Models 3a–3e**: Architecture tuning
  - Varying layers (more/less)
  - Filter size changes (16/32 vs. 64/128)
  - Dropout tuning

---

## 📈 Results Summary

| Model     | Accuracy (%) | Loss     |
|-----------|--------------|----------|
| Baseline  | 10.10        | 2.29     |
| Model 2 (Augmented) | ~36.36     | 1.94     |
| Model 3a  | 13.54        | 2.22     |
| Model 3b  | 14.58        | 2.20     |
| Model 3c  | 15.63        | 2.19     |
| Model 3d  | 17.71        | 2.19     |
| **Model 3e**  | **30.21**        | **2.21**     |

> Best performance achieved by simplifying architecture (Model 3e), suggesting reduced complexity prevents overfitting on small datasets.

---

## 🔍 Insights & Learnings

- CNN performance improves with data augmentation—even small datasets benefit.
- Architectural simplicity (fewer filters/layers) may outperform deeper models on limited data.
- Validation accuracy fluctuation emphasizes the importance of balanced datasets and proper tuning.

---

## 🧰 Tools & Frameworks

- **Languages**: R
- **Libraries**: `keras`, `EBImage`, `imager`, `abind`
- **Dataset Prep**: ImageMagick for RGBA conversion

---

## 🔗 References

- [Ishihara Color Blindness Dataset – Kaggle](https://www.kaggle.com/datasets/ammarshaker/ishihara-mnist)  
- [Gupta (2023) – Medium article](https://medium.com/@mayankkumargupta/color-blindness-chart-reader-c71e804b6f70)  
- [Ishihara Blind Test Cards – Kaggle](https://www.kaggle.com/datasets/dupeljan/ishihara-blind-test-cards)
