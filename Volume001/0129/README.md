# Hide-and-Seek Supporting System

たろう君はかくれんぼうが苦手です。隠れるとすぐ見つかっちゃうし、隠れている子をなかなか見つけ ることができません。見かねたお父さんは、超高性能位置探索システムを作ってくれました。これを使 うと自分の位置を含めて、友達の位置を正確に知ることができます。鬼になったら、隠れている子を探 すことが簡単にできるようになりました。見つけたい子の位置に行けば、それでOKのはずです。これを 使っていることがばれると遊んでもらえなくなるので内緒で使います。

たろう君はさらにこのシステムを進化させ、鬼から自分が見えるか否かを判定する機能を付加するこ とを思いつきました。これができれば、「もういいかい」と言われても、見える位置にいれば「まあだ だよ」だし、見えない位置にいれば「もういいよ」ですね。 いつも遊んでいる公園には大小さまざまな円筒形の壁があります。この壁は外からは中は見えない し、中から外も見えません。鬼と一緒に中に入ると別の壁がなければ見えちゃいます。

![][1]

たろう君はアイデアはいいのですが、ソフトを作るのが苦手です。そこで親友のあなたはたろう君に代 わって、「鬼から見えないこと確認システム」のソフトウェアを作ることになりました。公園の壁は固 定されていますが、たろう君と鬼のいろいろな位置情報に対して見えるか否かを判定する必要がありま す。公園にある壁の情報(中心の座標(wx,wy)と半径r)とたろう君と鬼の位置情報(たろう君の位置 の座標(tx,ty)と鬼の位置の座標(sx,sy))を入力とし、その位置で鬼からたろう君が見えるか否か を判定し終了するプログラムを作成してください。

なお、鬼からたろう君が見える場合にはDanger、見えない場合にはSafeと出力してください。鬼とた ろう君の位置を結んだ線分上に壁がある場合には見えないものとし、鬼もたろう君も壁の上にはいない ものとします。公園内の位置の座標は0以上255以下の整数の組で表されます。公園にある壁は100個以 下で、いずれの半径も整数であるとします。また、円筒形の壁の一部だけが公園にあるということはな く、全ての壁は円筒として、公園の内部に入っています。

## Input

複数のデータセットが与えられます。各データセットの形式は以下のとおり：

    n                円筒形の壁の数(整数)
    wx1 wy1 r1      壁の情報1(中心の座標(wx1,wy1)と半径(r1))
                    (それぞれ整数;半角空白区切り)
    wx2 wy2 r2      壁の情報2(中心の座標(wx2,wy2)と半径(r2))
                    (それぞれ整数;半角空白区切り)
    :
    :
    wxn wyn rn      壁の情報n(中心の座標(wxn,wyn)と半径(rn))
                    (それぞれ整数;半角空白区切り)
    m                たろう君と鬼の位置情報の個数
    tx1 ty1 sx1 sy1 位置情報1(たろう君の位置(tx1,ty1)と鬼の位置(sx1,sy1))
                    (それぞれ整数;半角空白区切り)
    tx2 ty2 sx2 sy2 位置情報2(たろう君の位置(tx2,ty2)と鬼の位置(sx2,sy2))
                    (それぞれ整数;半角空白区切り)
    :
    :
    txm tym sxm sym 位置情報m(たろう君の位置(txm,tym)と鬼の位置(sxm,sym))
                    (それぞれ整数;半角空白区切り)

n が 0 のとき入力の終わりを示します。

## Output

各データセットについて、以下を出力してください。

    位置情報1の判定結果DangerまたはSafe(半角英字)
    位置情報2の判定結果DangerまたはSafe(半角英字)
    :
    :
    位置情報mの判定結果DangerまたはSafe(半角英字)

## Sample Input

    3
    6 6 3
    19 7 4
    21 8 1
    6
    5 4 2 11
    12 4 2 11
    11 9 2 11
    14 3 20 5
    17 9 20 5
    20 10 20 5
    0

## Output for the Sample Input

    Safe
    Safe
    Danger
    Safe
    Danger
    Safe

* * *

Source: PC Koshien 2006, Preliminary Round , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2006   
(modified format)   
<http://www.pref.fukushima.jp/pc-concours/>

[1]: IMAGE1/hideandseek.gif
