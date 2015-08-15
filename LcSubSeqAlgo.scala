package com.webalo.scala.algo

/**
 * Longest common sub-sequence.
 */
class LcSubSeqAlgo {

  def lcs(s1: String, s2: String) : String = {
    
    def shortenBy1(s: String): String = s.substring(0, s.length - 1)
    def lastChar(s: String): Char = s.charAt(s.length - 1)
    def longest(s1: String, s2: String) = if (s1.length() > s2.length) s1 else s2
    
    if (s1 == null || s2 == null)
      throw new IllegalArgumentException
    else if (s1.isEmpty() || s2.isEmpty())
      ""
    else {
      if (lastChar(s1) == lastChar(s2))
        lcs(shortenBy1(s1), shortenBy1(s2)) + lastChar(s1)
      else {
        val firstOpt = lcs(s1, shortenBy1(s2))
        val secondOpt = lcs(s2, shortenBy1(s1))
        
        longest(firstOpt, secondOpt)
      }  
    }  
  }
}