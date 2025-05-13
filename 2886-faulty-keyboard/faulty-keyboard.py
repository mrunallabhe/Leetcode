class Solution(object):
    def finalString(self, s):
       n=len(s)
       ret=''
       i=0
       while(i<n):
        if(s[i]=='i'):
            ret=ret[::-1]
        else:
            ret+=s[i]
        i+=1

       return ret
 