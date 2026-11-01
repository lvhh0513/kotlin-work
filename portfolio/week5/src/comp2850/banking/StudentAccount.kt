package comp2850.banking

const val MAX_OVERDRAFT = 100

class StudentAccount(holder: String) : BankAccount(holder) {
    
    var overdraft: Int = 0
        set(value) {
            require(value in 0..MAX_OVERDRAFT){
                "Overdraft must be between 0 and $MAX_OVERDRAFT"
            }
        field = value
        }
    override fun withdraw(amount: Int) {
        if (amount <= 0) {
            throw IllegalArgumentException("Withdrawal amount must be greater than 0")
        } else if (amount.toLong() > balance.toLong() + overdraft.toLong()) {
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        } else {
            balance -= amount 
        }
    }

    fun withdrawalsAllowed(): Boolean {
        return balance > -overdraft
    }

    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }
}