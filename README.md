<p align="center">
  <img
    width="300px"
    src="https://user-images.githubusercontent.com/9600228/102414461-e3b92b00-3ff6-11eb-9c96-5f37c4d5e02c.png"
    alt="Vitamin Decathlon Design System logo" />
</p>

# Vitamin Android (beta)

[![Build Status](https://app.bitrise.io/app/62ac2962b2dd627a/status.svg?token=GlcHGXAWV2T4IItZiT43_A&branch=main)](https://app.bitrise.io/app/62ac2962b2dd627a)

> Decathlon Design System 🎨

Android Decathlon Design System is based on Material Design components described on the [official
documentation](https://material.io/) and developed in a
[library](https://github.com/material-components/material-components-android) maintained by
Google developers and designers.

But these native components are overridden to respect Decathlon's Visual Identity. You'll find
the design specifications and technical information for supported platforms by Decathlon on
[decathlon.design](https://www.decathlon.design/). If you are interested by a sample,
you can install a demo with `sample` module in the technical project.

## 🚀 Getting Started

To start using Vitamin in your app, you can check [the Vitamin module documentation](https://github.com/Decathlon/vitamin-android/tree/main/vitamin) 

## 📦 Artifacts

Group | Description
-- | --
com.decathlon.vitamin.foundation | Fundamental components of UI with texts, icons and colors.
com.decathlon.vitamin.buttons | Build UIs with ready to use Button components.
com.decathlon.vitamin.checkboxes | Build UIs with ready to use Checkbox components.
com.decathlon.vitamin.radiobuttons | Build UIs with ready to use RadioButton components.
com.decathlon.vitamin.switches | Build UIs with ready to use Switch components.
com.decathlon.vitamin.textinputs | Build UIs with ready to use TextInput components.
com.decathlon.vitamin.fabs | Build UIs with ready to use FloatingActionButton components.
com.decathlon.android.vitamin | Build UIs with ready to use Decathlon's Visual Identity components.

## 📥 Download

For now, release artifacts aren't yet available but you can test Vitamin Android from
snapshot artifact.

```kotlin
repositories {
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots/")
    }
}

implementation("com.decathlon.vitamin:vitamin:1.0.0-SNAPSHOT")
```

## 📝 License

    Copyright 2021 Decathlon.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
