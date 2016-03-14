# Drawing Lots

下図のような阿弥陀くじがあります。この例では縦線の数が５本あり、４本の横線が引かれています。横線は縦線をまたいでもよいとします。

![][1]

図の上部では 1, 2, 3, 4, 5 の順番であったものが、２番目と４番目の間での交換（これを (2, 4) のように書く）をし、さらに、(3, 5)(1, 2)(3, 4) の交換をしたので、図の下部に来たときは、4, 1, 2, 5, 3 になりました。

最初の状態　1, 2, 3, 4.... が、与えられた横棒のリスト（この例では、(2, 4)(3, 5)(1, 2)(3, 4) を通過したのち、どのような順番になるかを出力して終了するプログラムを作成して下さい。

## Input

    w
    n
    a1,b1
    a2,b2
    .
    .
    an,bn

w (整数：w ≤ 30) は縦線の本数、n (整数：n ≤ 30)は横棒の本数を表す。カンマで区切られた２つの整数 ai、bi の組がi番目の横棒を表す。

## Output

左から右に、  
1 番目の棒に来る数字  
2 番目の棒に来る数字  
.  
.  
w 番目の棒に来る数字  

## Sample Input

    5
    4
    2,4
    3,5
    1,2
    3,4

## Output for the Sample Input

    4
    1
    2
    5
    3

## Hint

[Try it.][2]

* * *

Source: PC Koshien 2003 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2003   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/amida1.gif
[2]: IMAGE1/lots.gif
