# じゃんけんプログラムを作ろう！

時系列（講義で解説した順）になっていますが、難易度が前後しますので、難易度順にチャレンジしても大丈夫です。

## 処理の流れが書ける

難易度：1

### STEP.1
[このコード](https://github.com/hyperkinoko/janken-sample/blob/1f79e02205734a8b65639b4c7529d236c7ab8c01/src/janken_sample/Main.java)を写経して、書いている内容が理解できる。
書き間違い、写し間違いでエラーが起こったときに、VSCodeのチカラを借りたり、お手本のコードと見比べて修正できる。

### STEP.2
上記コードの処理の流れを理解した上で、その流れに沿って自分でコードが書ける。  
エラーが起こったときに、ある程度はVSCodeのチカラを借りて修正できる。

## 列挙型とtoStringが理解できる

難易度：5

### STEP.1
[この時点](https://github.com/hyperkinoko/janken-sample/tree/e209dbd43354c24043b03f6b7a51328951e58f1c/src/janken_sample)でのコードを写経して、書いている内容が理解できる。  
列挙型（enum）の特徴が言える。

### STEP.2
特に`Main.java`の13〜25行目と`JankenHand.java`のコードについて、何をしているかを言える。
`JankenHand`のインスタンスは、3つの固定インスタンスしかなく、それぞれ「グーを表す`JankenHand.Rock`」「チョキを表す`JankenHand.Scissors`」「パーを表す`JankenHand.Paper`」であると理解できている。

### STEP.3
`JankenHand`のコードを見て、`toString`メソッドが、`Object`クラスの`toString`メソッドを「オーバーライド」していることが理解できる。

### STEP.4
`JankenHand`の`displayHand`メソッドと`toString`メソッドは、同じ処理をして同じものを返しているが、この2つの違いを`main`メソッド内の`System.out.println`や`System.out.print`で使うときの観点から説明できる。  
`toString`メソッドをオーバーライドするメリットが理解できている。

### STEP.5
適切に`Object`クラスの`toString`メソッドをオーバーライドするコードが自分で書ける。

## staticメソッドとその利点が理解できる

難易度：6

### STEP.1
[この時点](https://github.com/hyperkinoko/janken-sample/tree/847a4ae8125e82c3f37ad063c34a07110a54b6f0/src/janken_sample)でのコードを写経して、書いている内容がある程度読める。  
`Math`クラスの`static`メソッドである`max`を呼び出す（使う）方法がわかる。  
`JankenHand`の`static`メソッドである`fromInt`を呼び出す（使う）方法がわかる。

### STEP.2
`JankenHand`の`fromInt`メソッドが引数の数字に応じて、「グー」か「チョキ」か「パー」のインスタンスを返すことが理解できる。

```
JankenHand player = JankenHand.fromInt(2);
```

というコードで、`player`という変数に、「パー」を表すインスタンスである「JankenHand.Paper」が代入されていることがわかる。

### STEP.3
写経で流れを理解した上で、`Main.java`の11行目や18行目が自分で書ける。

### STEP.4

`JankenHand`の`fromInt`メソッドが`static`でなければならない理由が説明できる。  
逆に、`fromInt`メソッドが`static`でないコード（`fromInt`が`static`でない）を実際に書き、どの時点でどのような問題になるか確認できる。

## booleanを返すメソッドの実装や使用ができる

難易度：3

### STEP.1
[この時点](https://github.com/hyperkinoko/janken-sample/tree/b56261d59fecec6d6abb64a624738c15d38f6251/src/janken_sample)でのコードを写経して、書いている内容がある程度読める。

### STEP.2
写経で流れを理解した上で、`Main.java`の22〜28行目が自分で書ける。

### STEP.3
写経で流れを理解した上で、自力で`JankenHand`に`winTo`メソッドと`loseTo`メソッドを実装できる。

## 繰り返し処理が書ける staticフィールドが定義/使用できる

STEP.1 → 難易度：2
STEP.2以降 → 難易度：4

### STEP.1
[この時点](https://github.com/hyperkinoko/janken-sample/tree/jankencount2/src/janken_sample)でのコードを写経して、書いている内容がある程度読める。
書き間違い、写し間違いでエラーが起こったときに、VSCodeのチカラを借りたり、お手本のコードと見比べて修正できる。

### STEP.2
マジックナンバーとは何か、マジックナンバーを使ってはいけない理由を説明できる。  
マジックナンバーを使わないために、`final`をつけた定数（JANKEN_COUNT）を使うメリットを説明できる。

### STEP.3
`JANKEN_COUNT`が`static`になっている理由を、`main`メソッドから使用することと関連付けて説明できる。

## インターフェイスの定義/実装ができる

STEP.1、STEP.2 → 難易度：7
STEP.3 → 難易度：8

### STEP.1
[この時点](https://github.com/hyperkinoko/janken-sample/tree/9ba3ff8d887a76d72a0c803f4537bef5c74da8b8/src/janken_sample)でのコードを写経して、書いている内容がある程度読める。

> `nextHand`メソッドを持つ`JankenStrategy`インターフェイスを書きなさい。  
> `nextHand`メソッドは、パッケージの外部からアクセス可能で、引数は無し、返り値の型はJankenHand型である。

という指示を受けて、`JankenStrategy.java`が書ける。

また、

> `JankenStrategy`を実装する`FixedHandStrategy`を書きなさい。
> `nextHand`メソッドは、固定値として`JankenHand.Rock`を返すものとする。

という指示を受けて、`FixedHandStrategy.java`が書ける。

### STEP.2
`Pc.java`の7行目、8行目が理解できる。  
サンプルコードでは`Pc`が次の手を出す戦略として、`RandomStrategy`を使っているが、`FixedHandStrategy`を使うように書き換えることができる。

### STEP.3
このサンプルコードの状態から、trackの5章終わりの状態まで、理解しながら書き換えることができる。

* `Pc`クラスのフィールドとして`strategy`を定義し、その`setter`を書くことができる。
* `Pc`クラスの`nextHand`メソッドを、上記の変更に合わせて書き換えることができる。
* `FixedHandStrategy`に「どの手で固定するか」を表す`hand`フィールドを定義し、その初期化を行うコンストラクタ（引数に「固定する手」をとる）が書ける。
* `FixedHandStrategy`クラスの`nextHand`メソッドを、上記の変更に合わせて書き換えることができる。
* `main`メソッド内で、`Pc`クラスのインスタンス`pc`に対して、任意の戦略を設定するコードが書ける。

## インターフェイス定義時にデフォルトの挙動を設定したメソッドを書ける

STEP.1 〜 STEP.3 → 難易度：9
STEP.4 → 難易度 10

### STEP.1
[この時点](https://github.com/hyperkinoko/janken-sample/tree/53d2a8cd4417585549921e3f0b750230b9862c9b/src/janken_sample)でのコードを写経して、書いている内容がある程度読める。

> `JankenStrategy`インターフェイスに`prevHands`メソッドを追加しなさい。  
> `prevHands`メソッドは、パッケージの外部からアクセス可能で、返り値はなく、引数にJankenHand型のmyHandとenemyHandをとる。  
> `prevHands`メソッドは、実装先で必ずしもオーバーライドしなくてもよく、オーバーライドされなかったときは、何もしないように定義しておく。

という指示を受けて、`JankenStrategy.java`に正しいコードを追記できる。

`RandomStrategy`や`FixedHandStrategy`が`prevHands`メソッドをオーバーライドしなくても良いことを理解し、その場合の`prevHands`メソッドの挙動を説明できる。

###  STEP.2
`ChottoKashikoiStrategy.java`に書いてあるコードを理解できる。

### STEP.3
trackの6章終わりの状態（サンプルコードの状態）までを、ある程度理解しながら自力で完成させることができる。

### STEP.4
`prevHands`メソッドが実質`ChottoKashikoiStrategy`でしか実装されないにもかかわらず、独自のメソッドとしてではなく、`JankenStrategy`のメソッドとして定義しなければならない理由を、`main`メソッドや`Pc`クラスでどのように使用するかという観点から説明できる。

