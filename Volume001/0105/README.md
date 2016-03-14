# Book Index

本の最後には索引が設けられています。本の中から抽出された「語句」と「ページ番号」の組を読み取り、本の索引として「語句」とその語句が表れる「ページ番号のリスト」を出力して終了するプログラムを作成して下さい。ただし、1つの語句の長さは30文字以内とし、ページ番号は1,000以下とします。入力に含まれる語句とページ番号の組は100以下とし、1つの語句は同じページ番号に複数回現れないものとします。また、出力に関しては、語句の順番はアルファベット順とし、ページ番号は小さい順(昇順)とします。

## Input

    語句 ページ番号(半角英小文字,整数;半角空白区切り)
        :
        :

## Output

    語句
    ページ番号の列(整数;半角空白区切り)
    語句
    ページ番号の列(整数;半角空白区切り)
          :
          :

## Sample Input

    style 12
    even 25
    introduction 3
    easy 9
    style 7
    document 13
    style 21
    even 18

## Output for the Sample Input

    document
    13
    easy
    9
    even
    18 25
    introduction
    3
    style
    7 12 21

* * *

Source: PC Koshien 2005 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2005   
<http://www.pref.fukushima.jp/pc-concours/>