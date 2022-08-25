# Skeleton component

The skeleton component is split in 3 different views. The `VitaminSkeletonRectangularView` and `VitaminSkeletonRoundedView` to easily add shapes, the `VitaminSkeletonFrameLayout` to display the animation (the parent view).

### Skeleton design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

> **Disclaimer**
In this file, `Theme.Vitamin.<ThemeName>` will be used to indicate the different Vitamin themes. You
can retrieve [the Vitamin themes list here](../vitamin/README.md).

## VitaminSkeletonFrameLayout

### VitaminSkeletonFrameLayout usage specs / customize specs

This component is based on the `ShimmerFrameLayout` of Facebook. It already has been customized to fit the Vitamin needs, but for specific cases, you can use the [Facebook documentation](https://facebook.github.io/shimmer-android/) to edit it.

### Usage with Vitamin Theme

As this component is based on the `ShimmerFrameLayout` of Facebook, it's not included on the Vitamin theme, but it use it.
You have to use the Vitamin theme in the app and import the skeleton package.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
implementation("com.decathlon.vitamin:skeleton:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
```
   
```xml
<com.decathlon.vitamin.skeleton.VitaminSkeletonFrameLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.decathlon.vitamin.skeleton.VitaminSkeletonRoundedView
        ... 
    />

</com.decathlon.vitamin.skeleton.VitaminSkeletonFrameLayout>
```

### Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
implementation("com.decathlon.vitamin:skeleton:<version>")
```

```xml
<com.decathlon.vitamin.skeleton.VitaminSkeletonFrameLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:theme="@style/Theme.Vitamin.<ThemeName>">

    <com.decathlon.vitamin.skeleton.VitaminSkeletonRoundedView
    ...
    />

</com.decathlon.vitamin.skeleton.VitaminSkeletonFrameLayout>
```

## VitaminSkeletonRectangularView

### VitaminSkeletonRectangularView usage specs

This component draw a rectangle. You just have to modify the width and height to adjust the rectangle ratio (exemple: add the same width and height to draw a square).
You can find below the other options :

| Option                    | Attribute                                              | Related class field           | Default value |
|---------------------------|--------------------------------------------------------|-------------------------------|---------------|
| Corner radius             | `app:vtmnSkeletonRectangularView_cornerRadius` (in dp) | `cornerRadius` (in pixelSize) | 0             |

If you want to override the corner radius for all your `VitaminSkeletonRectangularView` components, you can define a custom style directly in your app theme:

| Element                              | Attribute                          | Default value                                       |
|--------------------------------------|------------------------------------|-----------------------------------------------------|
| VitaminSkeletonRectangularView style | `vtmnSkeletonRectangularViewStyle` | `@style/Widget.Vitamin.SkeletonRectangularView`     |

### Usage with Vitamin Theme

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
implementation("com.decathlon.vitamin:skeleton:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
```

```xml
<com.decathlon.vitamin.skeleton.VitaminSkeletonRectangularView
    android:layout_width="80dp"
    android:layout_height="80dp" />
```

```xml
<com.decathlon.vitamin.skeleton.VitaminSkeletonRectangularView
    android:layout_width="80dp"
    android:layout_height="80dp"
    app:vtmnSkeletonRectangularView_cornerRadius="4dp" />
```

### Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
implementation("com.decathlon.vitamin:skeleton:<version>")
```

```xml
<com.decathlon.vitamin.skeleton.VitaminSkeletonFrameLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:theme="@style/Theme.Vitamin.<ThemeName>">

    <com.decathlon.vitamin.skeleton.VitaminSkeletonRectangularView
        android:layout_width="80dp"
        android:layout_height="80dp" />

</com.decathlon.vitamin.skeleton.VitaminSkeletonFrameLayout>
```
    
### Customize the VitaminSkeletonRectangularView

You can also customize the `VitaminSkeletonRectangularView` style but keep in mind that **this is not recommended by Vitamin**

| Option            | Attribute                               | Related class field  | Default value                  |
|-------------------|-----------------------------------------|----------------------|--------------------------------|
| Color             | `app:vtmnSkeletonRectangularView_color` | `color`              | `?attr/vtmnBackgroundColorTertiary` |

If you want to override the color for all your `VitaminSkeletonRectangularView` components, you can define a custom style directly in your app theme:

| Element                              | Attribute                          | Default value                                       |
|--------------------------------------|------------------------------------|-----------------------------------------------------|
| VitaminSkeletonRectangularView style | `vtmnSkeletonRectangularViewStyle` | `@style/Widget.Vitamin.SkeletonRectangularView`     |


## VitaminSkeletonRoundedView

### VitaminSkeletonRoundedView usage specs

This component draw a round. You just have to modify the width and height to adjust the round ratio (exemple: add the same width and height to draw a circle).

### Usage with Vitamin Theme

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
implementation("com.decathlon.vitamin:skeleton:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
```

```xml
<com.decathlon.vitamin.skeleton.VitaminSkeletonRoundedView
    android:layout_width="80dp"
    android:layout_height="80dp" />
```

### Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
implementation("com.decathlon.vitamin:skeleton:<version>")
```

```xml
<com.decathlon.vitamin.skeleton.VitaminSkeletonFrameLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:theme="@style/Theme.Vitamin.<ThemeName>">

    <com.decathlon.vitamin.skeleton.VitaminSkeletonRoundedView
        android:layout_width="80dp"
        android:layout_height="80dp" />

</com.decathlon.vitamin.skeleton.VitaminSkeletonFrameLayout>
```

### Customize the VitaminSkeletonRoundedView

You can also customize the `VitaminSkeletonRoundedView` style but keep in mind that **this is not recommended by Vitamin**

| Option            | Attribute                           | Related class field  | Default value                  |
|-------------------|-------------------------------------|----------------------|--------------------------------|
| Color             | `app:vtmnSkeletonRoundedView_color` | `color`              | `?attr/vtmnBackgroundColorTertiary` |

If you wan to override the color for all your `VitaminSkeletonRoundedView` components, you can define a custom style directly in your app theme:

| Element                              | Attribute                      | Default value                                   |
|--------------------------------------|--------------------------------|-------------------------------------------------|
| VitaminSkeletonRoundedView style     | `vtmnSkeletonRoundedViewStyle` | `@style/Widget.Vitamin.SkeletonRoundedView`     |

## Licence

### ShimmerFrameLayout

The `VitaminSkeletonFrameLayout` is based on the `ShimmerFrameLayout` of Facebook.  
Copyright (c) Facebook, Inc. and its affiliates. All rights reserved.  
The `ShimmerFrameLayout` is under [BSD Licence](https://github.com/facebook/shimmer-android/blob/main/LICENSE)  
[ShimmerFrameLayout repository](https://github.com/facebook/shimmer-android/)