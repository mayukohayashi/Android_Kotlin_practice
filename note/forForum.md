## IntelliJ で作ってみる

1. New Project
2. Kotlin
3. Kotlin - JVM
4. src > 右クリック
5. New Kotlin file（名付け）

### fun main()

- fun main(){}は絶対いるやつ

```
fun main(){

}
```

### build 時のエラー

java のバージョンによって、ビルドエラー起こしたりするので、Stable なバージョンを install しなおす

```
$ brew cask uninstall java # uninstall java 入ってるやつ
$ brew tap homebrew/cask-versions
$ brew cask install java8 # install java8（安定してるやつ）
$ touch ~/.android/repositories.cfg # without this file, error will occur on next step
$ brew cask install android-sdk
```

もしくは、Update しても良いかも。やり方はコーヒーカップのやつを押してどうのこうの。コーヒーマーク嫌いなのでやりたくない。
呼んでもないのに Setting の中に入ってきたりするので Java はそういうとこやぞと思います。
