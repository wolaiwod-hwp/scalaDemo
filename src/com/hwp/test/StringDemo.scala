package com.hwp.test

/**
  * 字符串的应用
  */

object StringRun {
  def main(args: Array[String]): Unit = {
    val demo = new StringDemo()
    //    demo.twoMethodNewString()
    //    demo.getStringLength()
    //    demo.stringConcat()
    demo.printfDemo()
  }
}

class StringDemo {
  /**
    * 字符串的定义
    */
  def twoMethodNewString(): Unit = {
    val str = "Hello Scala"
    val str1: String = "Hello Scala"
    println(str, str1)
  }

  /**
    * 获得字符串长度
    */
  def getStringLength(): Unit = {
    val palindrome = "www.hwp.com"
    val len = palindrome.length()
    println("String Length is : " + len)
  }

  /**
    * 字符串拼接
    */
  def stringConcat(): Unit = {
    val str1 = "hwp "
    val str2 = "is "
    val str3 = "a "
    val str4 = "good man"
    println(str1 + str2)
    println(str3.concat(str4))
  }

  /**
    * 字符串格式化
    */
  def printfDemo(): Unit = {
    val floatVar = 1.4
    val intVar = 2
    val stringVar = "hwp"
    val result = printf("字符串变量：%s,整型变量：%d,浮点变量：%f", stringVar, intVar, floatVar)
    println()
    println(result.toString) //printf仅作输出，没有返回值
  }

  /**
    * 字符串的方法
    */
  def functionDemo(): Unit = {
    /**
      * char charAt(int index)	返回指定位置的字符
      * int compareTo(Object o)	比较字符串与对象
      * int compareTo(String anotherString)	按字典顺序比较两个字符串
      * int compareToIgnoreCase(String str)	按字典顺序比较两个字符串，不考虑大小写
      * String concat(String str)	将指定字符串连接到此字符串的结尾
      * boolean contentEquals(StringBuffer sb)	将此字符串与指定的 StringBuffer 比较。
      * static String copyValueOf(char[] data)	返回指定数组中表示该字符序列的 String
      * static String copyValueOf(char[] data, int offset, int count)	返回指定数组中表示该字符序列的 String
      * boolean endsWith(String suffix)	测试此字符串是否以指定的后缀结束
      * boolean equals(Object anObject)	将此字符串与指定的对象比较
      * boolean equalsIgnoreCase(String anotherString)	将此 String 与另一个 String 比较，不考虑大小写
      * byte getBytes()	使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
      * byte[] getBytes(String charsetName	使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
      * void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)	将字符从此字符串复制到目标字符数组
      * int hashCode()	返回此字符串的哈希码
      * int indexOf(int ch)	返回指定字符在此字符串中第一次出现处的索引
      * int indexOf(int ch, int fromIndex)	返返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索
      * int indexOf(String str)	返回指定子字符串在此字符串中第一次出现处的索引
      * int indexOf(String str, int fromIndex)	返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
      * String intern()	返回字符串对象的规范化表示形式
      * int lastIndexOf(int ch)	返回指定字符在此字符串中最后一次出现处的索引
      * int lastIndexOf(int ch, int fromIndex)	返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索
      * int lastIndexOf(String str)	返回指定子字符串在此字符串中最右边出现处的索引
      * int lastIndexOf(String str, int fromIndex)	返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索
      * int length()	返回此字符串的长度
      * boolean matches(String regex)	告知此字符串是否匹配给定的正则表达式
      * boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)	测试两个字符串区域是否相等
      * boolean regionMatches(int toffset, String other, int ooffset, int len)	测试两个字符串区域是否相等
      * String replace(char oldChar, char newChar)	返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的
      * String replaceAll(String regex, String replacement	使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
      * String replaceFirst(String regex, String replacement)	使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串
      * String[] split(String regex)	根据给定正则表达式的匹配拆分此字符串
      * String[] split(String regex, int limit)	根据匹配给定的正则表达式来拆分此字符串
      * boolean startsWith(String prefix)	测试此字符串是否以指定的前缀开始
      * boolean startsWith(String prefix, int toffset)	测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
      * CharSequence subSequence(int beginIndex, int endIndex)	返回一个新的字符序列，它是此序列的一个子序列
      * String substring(int beginIndex)	返回一个新的字符串，它是此字符串的一个子字符串
      * String substring(int beginIndex, int endIndex)	返回一个新字符串，它是此字符串的一个子字符串
      * char[] toCharArray()	将此字符串转换为一个新的字符数组
      * String toLowerCase()	使用默认语言环境的规则将此 String 中的所有字符都转换为小写
      * String toLowerCase(Locale locale)	使用给定 Locale 的规则将此 String 中的所有字符都转换为小写
      * String toString()	返回此对象本身（它已经是一个字符串！）
      * String toUpperCase()	使用默认语言环境的规则将此 String 中的所有字符都转换为大写
      * String toUpperCase(Locale locale)	使用给定 Locale 的规则将此 String 中的所有字符都转换为大写
      * String trim()	使用给定 Locale 的规则将此 String 中的所有字符都转换为大写
      * static String valueOf(primitive data type x)	返回指定类型参数的字符串表示形式
      */
  }
}
