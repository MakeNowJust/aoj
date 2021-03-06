# Patisserie

ケーキ屋さんが、まちまちな大きさのロールケーキをたくさん作りました。あなたは、このケーキを箱に並べる仕事を任されました。

ロールケーキはとてもやわらかいので、他のロールケーキが上に乗るとつぶれてしまいます。ですから、図(a)のように全てのロールケーキは必ず箱の底面に接しているように並べなければなりません。並べ替えると必要な幅も変わります。n 個のロールケーキの半径 r1 , r2 ・・・・・・・・ rn と箱の長さを読み込み、それぞれについて、箱の中にうまく収まるかどうか判定し、並べる順番を工夫すると箱に入る場合は"OK"、どう並べても入らない場合には"NA"を出力して終了するプログラムを作成してください。ロールケーキの断面は円であり、箱の壁の高さは十分に高いものとします。 ただし、ロールケーキの半径は 3 以上 10 以下の整数とします。つまり、ケーキの半径に極端な差はなく、図(b)のように大きなケーキの間に小さなケーキがはまり込んでしまうことはありません。また、ケーキの個数 n は 12 個以下とします。

図(a)

![][1]

図(b)

![][2]

## Input

    1 つ目のデータの箱の長さ,1‾n 個目のロールケーキの半径(整数;空白区切り)
    2 つ目のデータの箱の長さ,1‾n 個目のロールケーキの半径(整数;空白区切り)
                         :
                         :

## Output

OK または NA(半角英大文字)

## Sample Input

    30 4 5 6
    30 5 5 5
    50 3 3 3 10 10
    49 3 3 3 10 10

## Output for the Sample Input

    OK
    OK
    OK
    NA

* * *

Source: PC Koshien 2005 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2005   
(modified format)   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/patisserie1.gif
[2]: IMAGE1/patisserie2.gif
