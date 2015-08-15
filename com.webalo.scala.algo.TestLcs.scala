package com.webalo.scala.algo

object TestLcs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(99); val res$0 = 
 new LcSubSeqAlgo().lcs("ACBDEGCEDBG", "BEGCFEUBK");System.out.println("""res0: String = """ + $show(res$0));$skip(45); val res$1 = 
 new LcSubStrAlgo().lcs("ABCDE", "BCXBCDYZ");System.out.println("""res1: String = """ + $show(res$1))}
}
