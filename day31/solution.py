import random
from sympy import mod_inverse, isprime

def generate_prime(bits):
    while True:
        prime = random.getrandbits(bits)
        if isprime(prime):
            return prime
        
def generate_keys(bits=1024):
    p = generate_prime(bits)
    q = generate_prime(bits)
    n = p*q
    phi = (p-1) * (q-1)
    e = 65537
    d = mod_inverse(e, phi)
    return (e, n), (d, n)

def encrypt(message, public_key):
    e, n = public_key
    message_int = int.from_bytes(message.encode('utf-8'), 'big')
    cipher_int = pow(message_int, e, n)
    return cipher_int

def decrypt(cipher, private_key):
    d, n = private_key
    message_int = pow(cipher, d, n)
    message_bytes = message_int.to_bytes((message_int.bit_length() + 7) // 8, 'big')
    return message_bytes.decode('utf-8')
