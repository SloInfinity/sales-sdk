# sales-sdk

The sales-sdk is for Android cash register software.

The protocol is ZVT (production) or alternatively Nero-4.0 (alpha status/untested with certified terminals). The ZVT interface is already used productively and can be used directly.

## Getting Started

Clone the project and load it into Android Studio.

- salesSdk is SDK itself
- saleTerminal is the demo app and documentation at the same time.

### Prerequisites

You need a actual android-studio from "https://developer.android.com/studio". At least you need the android sdk and build with gradle only

* [AndroidStudio](https://developer.android.com/studio) - Android Studio

```
~/tmp λ git clone git@github.com:lavego/sales-sdk.git salesSdk
Cloning into 'salesSdk'...
remote: Enumerating objects: 1225, done.
remote: Counting objects: 100% (1225/1225), done.
remote: Compressing objects: 100% (866/866), done.
remote: Total 1225 (delta 334), reused 1215 (delta 334), pack-reused 0
Receiving objects: 100% (1225/1225), 837.48 KiB | 1.99 MiB/s, done.
Resolving deltas: 100% (334/334), done.

~/tmp λ cd salesSdk
~/tmp/salesSdk λ export ANDROID_SDK_ROOT=/Users/ah/Library/Android/sdk
~/tmp/salesSdk λ ./gradlew assemble

> Configure project :
...
```

## Contributing

TODO, write how to contribute...

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Authors

* **Andre Heine/Lavego AG** - *Initial work* - [Lavego AG](https://www.lavego.de)

## License

This project is licensed under the GNU Lesser General Public License v3.0 - see the [LICENSE.md](LICENSE.md) file for details

## Developing you cash-register software

To get started quickly, take a look at the "saleTerminal" project.

In saleSdk the best entry is: 

* [sdk start](https://github.com/lavego/sales-sdk/blob/main/saleSdk/src/main/java/de/lavego/sdk/PaymentTerminalActivity.java)

## Acknowledgments

* [Android](https://developer.android.com) - Android Studio
* [ZVT](https://www.terminalhersteller.de/downloads/PA00P015_13.08_en.pdf) - ZVT Spec 13.08
* [ZVT part 2](https://www.terminalhersteller.de/downloads/PA00P016_04_en.pdf) - ZVT Part 2
* [Nexo Standards](https://www.nexo-standards.org/) - Nexo
