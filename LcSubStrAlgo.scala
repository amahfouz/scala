package com.webalo.scala.algo

/**
 * Longest common sub string.
 */
class LcSubStrAlgo {

  def shortenBy1(s: String): String = s.substring(0, s.length - 1)
  def lastChar(s: String): Char = s.charAt(s.length - 1)
  def longest(s1: String, s2: String) = if (s1.length() > s2.length) s1 else s2  
  
  def allPrefixes(s:String) = { for (i <- 1 to s.length) yield s.take(i) }
  
  def commonSuffix(s1: String, s2: String): String = {
    if (s1 == "" || s2 == "") 
      ""
    else if (lastChar(s1) == lastChar(s2))
      commonSuffix(shortenBy1(s1), shortenBy1(s2)) + lastChar(s1)
    else
      ""
  }
  
  def lcs(s1: String, s2: String): String = {
    if (s1 == null || s2 == null)
      throw new IllegalArgumentException
    
    if (s1 == "" || s2 == "") 
      ""
    else {
      val commonSuffixes = for {
        p1 <- allPrefixes(s1)
        p2 <- allPrefixes(s2)
      } yield commonSuffix(p1, p2)
      
      commonSuffixes reduceLeft(longest(_, _))
    }
  }
}