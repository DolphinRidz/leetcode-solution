package com.leetcode.string;

import java.util.Arrays;

class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        
        int[] mappingDictStoT = new int[256];
        Arrays.fill(mappingDictStoT, 0);
        
        int[] mappingDictTtoS = new int[256];
        Arrays.fill(mappingDictTtoS, -1);
        
        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);//o=111
            char c2 = t.charAt(i);//r=114
            //e->101 g->103  a->97 d->100
            //f-> 102 o->111 b->98 a->97 r->114
            // Case 1: No mapping exists in either of the dictionaries
            if (mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
                mappingDictStoT[c1] = c2;
                mappingDictTtoS[c2] = c1;
            }
            
            // Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists and
            // it doesn't match in either of the dictionaries or both 
            else if (!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="egg", t="add";
    	String s="foo", t="bar";
    	
		boolean isIsomorphic = isIsomorphic(s,t);
		if(isIsomorphic)
    		System.out.print("String: "+s+" and String: "+t +" are isIsomorphic");
		else
			System.out.print("String: "+s+" and String: "+t +" are not isIsomorphic");
			
		
	}
}