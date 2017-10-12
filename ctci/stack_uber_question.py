def method(l):
    l = list(l)
    length = len(l)
    stack = []
    index = 0
    for element in l:
        print("****------****")
        if not element in ['(', '{', '[', ']', '}', ')']:
        	print("skipped number: " + element)
        	continue
        if element in ['(', '{', '[']:
            print("added symbol to stack: " + element)
            stack.append(element)
            continue
        if len(stack) == 0:
            print("length of stack is 0")
            return False

        print("found element not number, not left paren!" + str(element))
        top = stack.pop()
        print("popped the top from the stack, " + str(top) )
        if not is_matched(top,element):
            print("not matched")
            return False
    if(len(stack)==0):
        print("stack length is zero")
        return True
    else :
        print("return false")
        return False

def is_matched(left,right):
    if left == '(':
        return right == ')'
    elif left == '[':
        return right == ']'
    elif left == '{':
        return right == '}'
    return False

        
t = "45(( ))"
print(method(t))




