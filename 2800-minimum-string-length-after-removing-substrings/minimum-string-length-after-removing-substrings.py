class Solution(object):
    def minLength(self, s):
        while 'AB' in s or 'CD' in s:
            s = s.replace('AB', '')
            s = s.replace('CD', '')
        return len(s)
