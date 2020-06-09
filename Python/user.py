from account import account

class User(Account):
    id = int
    name = str
    document = str
    email = str
    password = str

    def __init__(self, id, name, document, email, password):
        super().__init__(id, name, document, email, password)