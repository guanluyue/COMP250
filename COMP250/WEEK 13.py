import copy
class SillyString:
    def __init__(self,s):
        self.s = str(s)
        print('str+1')
        
class SillyStrings:
    def __init__(self,strs):
        self.strs = strs
        print('strs+1')
    def add_silly_string(self,s_):
        self.strs.append(s_)
        print('strs+1')
        
silly_strings = []
for i in range(5):
    silly_strings.append(SillyString(i))
x = SillyStrings(silly_strings)

new_s = SillyString(5)
x.add_silly_string(new_s)

silly_strings.append(new_s)
y = SillyStrings(silly_strings)

z = copy.deepcopy(x)

print(x)
print(z)
class SpecialInt:
    def __init__(self,x):
        self.x = int(x)
    def __eq__(self, other):
        return self.x == other
print(SpecialInt(1) == 1)

class Candy:
    def __init__(self, x=1):
        self.x = x
    @Class
    def best_s(cls):
        cls()
        
    def __eq__(self, other):
        return self.x == other.x
s = Candy()
print(s == Candy.best_s)