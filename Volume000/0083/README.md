# Era Name Transformation

西暦で表された年月日を、元号を用いた和暦に変換し、その年月日を出力して終了するプログラムを作成してください。入力は例に示すように3つの整数であり、順に西暦年、月、日です。これを、出力例に示すように変換してください。なお、明治以前の年月日が入力された場合は「pre-meiji」と表示してください。

各年号の最初の年は「元年」ではなく「１年」と出力することとします。

| ----- |
| 元号 | 期間 |
| meiji | 1868\. 9. 8 〜 1912. 7.29 |
| taisho | 1912\. 7.30 〜 1926.12.24 |
| showa | 1926.12.25 〜 1989. 1. 7 |
| heisei | 1989\. 1. 8 〜 |

## 入力

複数の入力が与えられます。各入力は以下の形式です。

    年（整数）月（整数）日（整数）

入力の終わりまで処理してください。

## 出力

元号　年月日

## Sample Input

    2005 9 3
    1868 12 2
    1868 9 7

## Output for the Sample Input

    heisei 17 9 3
    meiji 1 12 2
    pre-meiji

* * *

Source: PC Koshien 2005 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2005   
(extended format)   
<http://www.pref.fukushima.jp/pc-concours/>