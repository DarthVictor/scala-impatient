class BankAccount{
    private var account: Double = 0
    def balance = account
    def deposit(value: Int){
        account += value
    }
    def withdraw(value: Int){
        if (value <= account)
			account -= value
		else
			throw new Exception("Too small balance = " + account)
    }
}
