# Baseball Simulation

野球の好きな一郎くんは、試合の経過にしたがって発生したイベントを入力すると、そのイニングの得点を表 示する野球シミュレーションを作成することにしました。発生するイベントをシングルヒット、ホームラン、アウトの 3 種類に絞り、次の通りに考えることにしました。

○シングルヒット

* 新たに 1 塁に走者が出ます。
* 1 塁にいた走者は 2 塁に、2 塁にいた走者は 3 塁に進みます。
* 3 塁に走者がいた場合、その走者は本塁にかえり塁上から消えます。
そして、得点に1点が加算されます。

○ホームラン

* 塁上にいた走者すべてが本塁にかえり塁上から消えます。
* 塁上にいた走者の数 1が得点に加算されます。

○アウト

* アウトカウントが 1 つ加算されます。
* 塁上の走者の状態と得点は変化しません。
* アウトカウントが 3 つになった時点でイニングは終了します。

一郎くんはこれらの発生したイベントをそれぞれ HIT、 HOMERUN、OUT で表すことにし、作成することとしました。 野球の試合経過を表すイベントデータを読み込み、そのイニングに入った得点を出力して 終了するプログラムを作成してください。ただし、イベントは 100 個以下とします。

## Input

複数のデータが与えられます。最初の行にデータセット数nが与えられます。各データセットは以下のとおり：

    1イニングに発生したイベントを表す文字列(半角)

## Output

各データセットについてそのイニングに入った得点(整数)を１行に出力する。

## Sample Input

    2
    HIT
    OUT
    HOMERUN
    HIT
    HIT
    HOMERUN
    HIT
    OUT
    HIT
    HIT
    HIT
    HIT
    OUT
    HIT
    HIT
    OUT
    HIT
    OUT
    OUT

## Output for the Sample Input

    7
    0

* * *

Source: PC Koshien 2005 , All-Japan High School Programming Contest, Aizu-Wakamatsu, Japan, 2005   
(modified format)   
<http://www.pref.fukushima.jp/pc-concours/>