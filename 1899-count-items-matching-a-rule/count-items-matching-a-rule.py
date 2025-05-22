class Solution(object):
    def countMatches(self, items, ruleKey, ruleValue):
        cnt = 0
        if(ruleKey=="type"):
            for i in items:
                if(i[0]==ruleValue):
                    cnt+=1
        elif(ruleKey=="color"):
            for i in items:
                if(i[1]==ruleValue):
                    cnt+=1
        else:
            for i in items:
                if(i[2]==ruleValue):
                    cnt+=1
        return cnt