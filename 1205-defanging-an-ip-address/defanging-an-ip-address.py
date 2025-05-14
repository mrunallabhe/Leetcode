class Solution(object):
    def defangIPaddr(self, address):
        n=len(address)
        result=''
        i=0
        while(i<n):
            if(address[i]=='.'):
                result+='[.]'
            else:
                result+=address[i]
            i+=1
        return result

        