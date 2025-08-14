# 💳 Sistema Bancário em Java

Este é um projeto simples em **Java** que simula uma conta bancária com **operações básicas** e gerenciamento de **cheque especial**, totalmente interativo via **menu no console**.

---

## 🚀 Funcionalidades

✅ Consultar saldo  
✅ Consultar limite do cheque especial  
✅ Depositar dinheiro (quitando cheque especial se usado, com taxa)  
✅ Sacar dinheiro (respeitando limite do saldo + cheque especial)  
✅ Pagar boleto (respeitando limite)  
✅ Verificar se a conta está usando cheque especial  

---

## 📜 Regras de Negócio

- Ao criar a conta, o **cheque especial** é calculado com base no depósito inicial:
  - **Depósito ≤ R$500,00** → Cheque especial = **R$50,00**
  - **Depósito > R$500,00** → Cheque especial = **50% do valor depositado**
- Caso o cheque especial seja usado, assim que possível será cobrada uma **taxa de 20%** sobre o valor utilizado.

---