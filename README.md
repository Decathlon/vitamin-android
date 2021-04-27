<p align="center">
  <img
    width="300px"
    src="https://user-images.githubusercontent.com/9600228/102414461-e3b92b00-3ff6-11eb-9c96-5f37c4d5e02c.png"
    alt="Vitamin Decathlon Design System logo" />
</p>

# Vitamin Android (beta)

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

In the style of your application, you just need to specify `Theme.Decathlon` as parent.

```xml
<style name="AppTheme" parent="Theme.Vitamin" />
```

And specify this style in your Android Manifest file as style of your application or one of your
activity.

```xml
<manifest
    ...>

    <application
        ...
        android:theme="@style/AppTheme">

        <activity
            ...
            android:theme="@style/AppTheme" />
    </application>
</manifest>
```

If you want more information about the integration, please see the official documentation or
the sample. All links in the Documentation section of this page.

## 📦 Artifacts

Group | Description
-- | --
com.decathlon.android.foundation | Fundamental components of UI with texts, icons and colors.
com.decathlon.android.buttons | Build UIs with ready to use Button components.
com.decathlon.android.checkboxes | Build UIs with ready to use Checkbox components.
com.decathlon.android.radiobuttons | Build UIs with ready to use RadioButton components.
com.decathlon.android.switches | Build UIs with ready to use Switch components.
com.decathlon.android.vitamin | Build UIs with ready to use Decathlon's Visual Identity components.

## 📥 Download

Not yet available.

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
