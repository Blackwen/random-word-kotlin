package com.zetcode 

import java.io.File // 导入文件IO包
import kotlin.random.Random // 导入Kotlin随机数生成包   

fun main() {

  val fileName = "word.txt" // 定义文件名

  val myList = mutableListOf<String>() // 创建可变字符串列表

  File(fileName).useLines { lines -> myList.addAll(lin es) } // 读取文件内容到列表
  
  val randomIndex = Random.nextInt(myList.size) // 生成随机数索引
  
  println("")
  println(myList[randomIndex]) // 打印随机选取的行
  println("")

}
