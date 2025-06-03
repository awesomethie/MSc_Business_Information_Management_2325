# 📊 EBI Customer Churn Analysis – Big Data Management & Analytics

## 🧠 Part A: Educational Video – Explaining Gradient Boosting

We created an educational video to explain **Gradient Boosting**, a powerful supervised learning algorithm for classification and regression tasks. The video covers:

- 🎯 **Core Mechanics**: Weak learners, boosting, sequential model updates.
- 🔢 **Mathematics**: Gradient descent optimization for residuals.
- 💼 **Applications**: Fraud detection, churn prediction, click-through rate modeling.
- 💻 **Demonstration**: Hands-on model training with sample code in Python.

📺 [Video Link Here](#) *(Replace with actual YouTube or Panopto link)*

---

## 📦 Part B: Customer Churn Analysis for EuroBank International (EBI)

### 🧩 Project Context

**Client**: EuroBank International  
**Problem**: EBI is experiencing high customer churn. Our team was tasked to analyze data and build a predictive model to proactively target at-risk customers.

**Dataset**:  
- `ebi_base_customers.csv`: Includes churn labels  
- `ebi_exp_customers.csv`: Churn labels not included (used for scoring)

---

## 🧼 Data Preprocessing

- **Outliers**: Identified in credit score and age. Age was log-transformed to reduce skew.  
- **Irrelevant Features**: `customer_id` dropped.  
- **Categorical Variables**: `gender` and `country` one-hot encoded (France & Female omitted as base).

---

## 📊 Exploratory Data Analysis

- **Overall churn rate**: 20.36%  
- **Highest churn by demographics**:
  - **Gender**: Female – 24.98% vs. Male – 16.49%
  - **Country**: Germany – 33.32%
  - **Age group 50–60**: 55.57% churn rate
- **Behavioral insights**:
  - Customers with 3–4 products: >80% churn
  - Inactive customers: 26.6% churn vs. Active: 14.4%
  - Balance = 0: least likely to churn

---

## 🤖 Model Building

**Models Used**:
- CatBoost  
- XGBoost  
- Random Forest  
- Logistic Regression  
- K-Nearest Neighbors (KNN)

**Techniques**:
- SMOTE-ENN for class balancing  
- Grid Search + 5-fold CV  
- F1 score optimized for tuning  
- Permutation importance for feature analysis  

**Top Features**:
- `log_age`, `active_member`, `products_number`, `gender_Male`, `balance`

**Best Performing Model**:  
- **XGBoost**: Best F1 (0.566), Precision (0.504), ROC AUC (0.825)  
- **KNN (reduced)**: Best Recall (0.702) – ideal when catching churners is critical  

---

## 🧠 Recommendations

### 1. **Age-Based Retention Strategy**
- Target group: Customers aged 40–70 (esp. 50–60)
- Tactics: Financial products for retirement, estate planning, reopen branches

### 2. **Competitive Bundle Pricing**
- Target group: Customers with 3–4 products
- Tactics: Pricing benchmark vs. competitors, bundle discounts, sensitivity testing

### 3. **Active Member Engagement Program**
- Target group: Inactive customers
- Tactics: Early warning systems, re-engagement campaigns, digital UX enhancements

---

## 📈 Profit Optimization

Using churn probabilities on `ebi_exp_customers.csv`, we simulated two scenarios:

| Retention Value | Optimal Threshold | % Customers Targeted | Expected Profit |
|------------------|-------------------|------------------------|------------------|
| €5               | 0.152             | 54.3% (543 customers)  | €260             |
| €10              | 0.071             | 69.2% (692 customers)  | €1,176           |

We recommend using lower probability thresholds when retention value is high, to capture more potential churners and maximize ROI.

---

## 📎 Project Deliverables

- 📹 **Part A Video**: Gradient Boosting Explained  
- 📑 **Part B Report**: Data analysis, modeling, recommendations  
- 📊 **Presentation Deck**: 10-slide summary to executive management  
- 💻 **Code File**: Python scripts with SMOTE-ENN, XGBoost, KNN, tuning, evaluation  
- 📄 **Churn Predictions CSV**: Scored predictions on new customer set
