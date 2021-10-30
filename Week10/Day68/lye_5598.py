print(''.join(chr((ord(c)-3)) if ord(c)>67 else chr((ord(c)+23)) for c in input()))
## 또 이러네.