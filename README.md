# About Random-word-kotlin.

Just practice kotlin's read file operation.

## How to run it.

First, you should install kotlin,else you can't build and run it on terminal.

### 1. Prepare documents.

You need to prepare a word file, like `word.txt.`

```
emperor   /ˈempərə(r)/ n. 皇帝；君主
exact*    /ɪgˈzækt/    a. 精确的；准确的
traditional* [trəˈdɪʃənl] a. 传统的，惯例的；口传的，传说的
lack*     /læk/        n./vt. 缺乏，不足，没有
pardon*   /ˈpɑːdn/     excl.（用于请求别人重复某事）什么，请再说一遍 n./vt. 原谅，宽恕；赦免
regent    /ˈriːdʒənt/  n. 摄政者（代国王统治者）
burgeon*  /ˈbɜːdʒən/   vi. 迅速成长；发展
argue*    /ˈɑːgjuː/    v. 争论；说服
```

It should be noted that the name of this file should match the file name in `main.kt`.

### 2. Build.

Open your terminal and start executing the command.

```bash

kotlinc main.kt -include-runtime -d main.jar

```

 You can customize the name of this .jar file

### 3. Run.

```bash

java -jar main.jar

```

Use `java -jar` command run it.
