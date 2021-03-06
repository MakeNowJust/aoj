# Tsuruga Castle

会津若松市のシンボルである鶴ヶ城は、蒲生氏郷が本格的な天守閣を築城し、「鶴ヶ城」と名付けました。天守閣からは会津盆地が一望できます。また、晴れた日には、白虎隊で有名な飯盛山の山頂から鶴ヶ城を見ることができます。

会津若松市の今後の広報活動の参考にするため、鶴ヶ城に訪れた来場者について、年代調査をすることにしました。来場者の年齢を入力とし、下記の年齢区分別に人数を出力するプログラムを作成してください。ただし、来場者の人数は1,000,000人未満とします。

|   区分   |   年齢   |
|----------|----------|
| 10歳未満 |   0 - 9  |
|  10代    |  10 - 19 |
|  20代    |  20 - 29 |
|  30代    |  30 - 39 |
|  40代    |  40 - 49 |
|  50代    |  50 - 59 |
| 60歳以上 |  60 -    |

![][1]

## Input

複数のデータセットの並びが入力として与えられます。入力の終わりはゼロひとつの行で示されます。各データセットは以下のとおりです。

    1行目  来場者の人数 n(整数)
    2行目  1人目の来場者の年齢(整数)
    3行目  2人目の来場者の年齢(整数)
             :
             :
    n 1行目 n人目の来場者の年齢(整数)

## Output

入力データセット毎に以下の形式で出力します。

    1行目 10歳未満の人数(整数)
    2行目 10代の人数(整数)
    3行目 20代の人数(整数)
    4行目 30代の人数(整数)
    5行目 40代の人数(整数)
    6行目 50代の人数(整数)
    7行目 60歳以上の人数(整数)

## Sample Input

    8
    71
    34
    65
    11
    41
    39
    6
    5
    4
    67
    81
    78
    65
    0

## Output for the Sample Input

    2
    1
    0
    2
    1
    0
    2
    0
    0
    0
    0
    0
    0
    4

* * *

Source: PC Koshien 2008 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2008   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/tsuruga.jpg
