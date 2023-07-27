# Tag component

## Tag design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you have the `VitaminTag` component or the `Material Chip` component.

> **Disclaimer**
In this file, `Theme.Vitamin.<ThemeName>` will be used to indicate the different Vitamin themes. You
can retrieve [the Vitamin themes list here](../vitamin/README.md).

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<style name="AppTheme" parent="Theme.Vitamin.<ThemeName>" />
```

```xml
<com.decathlon.android.tags.VitaminMediumTagAccent
     android:layout_width="wrap_content"
     android:layout_height="wrap_content"
     android:text="Tag" />
```

or :

```xml
<com.google.android.material.chip.Chip
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    style="@style/Widget.Vitamin.Tag.Medium.Accent"
    android:text="Tag" />
```

For adding an icon, you need to use this tag : `app:tagIcon` if you are using a `Vitamin Tag`, or a `app:chipIcon` if you are using a `Material Chip`.
```xml
<com.decathlon.android.tags.VitaminMediumTagAccent
     android:layout_width="wrap_content"
     android:layout_height="wrap_content"
     android:text="Tag"
     app:tagIcon="@drawable/ic_vtmn_football_line" />
```

or :

```xml
<com.google.android.material.chip.Chip
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    style="@style/Widget.Vitamin.Tag.Medium.Accent"
    app:chipIcon="@drawable/ic_vtmn_football_line"
    android:text="Tag" />
```



With the same usage as above, you have multiple tag types available: 

We recommend you to use a specific size for Tag component, as now the default VitaminTag is just an alias for VitaminTagMedium.

| Tag type                               | Kotlin Class                                    | Attribute style                                         |
|----------------------------------------|-------------------------------------------------|---------------------------------------------------------|
| Medium Accent                          | `VitaminTagMediumAccent`                        | `?attr/vtmnTagMediumAccentStyle`                        |
| Medium Alert                           | `VitaminTagMediumAlert`                         | `?attr/vtmnTagMediumAlertStyle`                         |
| Medium Brand                           | `VitaminTagMediumBrand`                         | `?attr/vtmnTagMediumBrandStyle`                         |
| Medium Decorative Gravel               | `VitaminTagMediumDecorativeGravel`              | `?attr/vtmnTagMediumDecorativeGravelStyle`              |
| Medium Decorative Brick                | `VitaminTagMediumDecorativeBrick`               | `?attr/vtmnTagMediumDecorativeBrickStyle`               |
| Medium Decorative Saffron              | `VitaminTagMediumDecorativeSaffron`             | `?attr/vtmnTagMediumDecorativeSaffronStyle`             |
| Medium Decorative Gold                 | `VitaminTagMediumDecorativeGold`                | `?attr/vtmnTagMediumDecorativeGoldStyle`                |
| Medium Decorative Jade                 | `VitaminTagMediumDecorativeJade`                | `?attr/vtmnTagMediumDecorativeJadeStyle`                |
| Medium Decorative Emerald              | `VitaminTagMediumDecorativeEmerald`             | `?attr/vtmnTagMediumDecorativeEmeraldStyle`             |
| Medium Decorative Cobalt               | `VitaminTagMediumDecorativeCobalt`              | `?attr/vtmnTagMediumDecorativeCobaltStyle`              |
| Medium Decorative Amethyst             | `VitaminTagMediumDecorativeAmethyst`            | `?attr/vtmnTagMediumDecorativeAmethystStyle`            |
| Medium Accent Interactive              | `VitaminTagMediumAccentInteractive`             | `?attr/vtmnTagMediumAccentInteractiveStyle`             |
| Medium Alert Interactive               | `VitaminTagMediumAlertInteractive`              | `?attr/vtmnTagMediumAlertInteractiveStyle`              |
| Medium Brand Interactive               | `VitaminTagMediumBrandInteractive`              | `?attr/vtmnTagMediumBrandInteractiveStyle`              |
| Medium Decorative Gravel Interactive   | `VitaminTagMediumDecorativeGravelInteractive`   | `?attr/vtmnTagMediumDecorativeGravelInteractiveStyle`   |
| Medium Decorative Brick Interactive    | `VitaminTagMediumDecorativeBrickInteractive`    | `?attr/vtmnTagMediumDecorativeBrickInteractiveStyle`    |
| Medium Decorative Saffron Interactive  | `VitaminTagMediumDecorativeSaffronInteractive`  | `?attr/vtmnTagMediumDecorativeSaffronInteractiveStyle`  |
| Medium Decorative Gold Interactive     | `VitaminTagMediumDecorativeGoldInteractive`     | `?attr/vtmnTagMediumDecorativeGoldInteractiveStyle`     |
| Medium Decorative Jade Interactive     | `VitaminTagMediumDecorativeJadeInteractive`     | `?attr/vtmnTagMediumDecorativeJadeInteractiveStyle`     |
| Medium Decorative Emerald Interactive  | `VitaminTagMediumDecorativeEmeraldInteractive`  | `?attr/vtmnTagMediumDecorativeEmeraldInteractiveStyle`  |
| Medium Decorative Cobalt Interactive   | `VitaminTagMediumDecorativeCobaltInteractive`   | `?attr/vtmnTagMediumDecorativeCobaltInteractiveStyle`   |
| Medium Decorative Amethyst Interactive | `VitaminTagMediumDecorativeAmethystInteractive` | `?attr/vtmnTagMediumDecorativeAmethystInteractiveStyle` |
| Small Accent                           | `VitaminTagSmallAccent`                         | `?attr/vtmnTagSmallAccentStyle`                         |
| Small Alert                            | `VitaminTagSmallAlert`                          | `?attr/vtmnTagSmallAlertStyle`                          |
| Small Brand                            | `VitaminTagSmallBrand`                          | `?attr/vtmnTagSmallBrandStyle`                          |
| Small Decorative Gravel                | `VitaminTagSmallDecorativeGravel`               | `?attr/vtmnTagSmallDecorativeGravelStyle`               |
| Small Decorative Brick                 | `VitaminTagSmallDecorativeBrick`                | `?attr/vtmnTagSmallDecorativeBrickStyle`                |
| Small Decorative Saffron               | `VitaminTagSmallDecorativeSaffron`              | `?attr/vtmnTagSmallDecorativeSaffronStyle`              |
| Small Decorative Gold                  | `VitaminTagSmallDecorativeGold`                 | `?attr/vtmnTagSmallDecorativeGoldStyle`                 |
| Small Decorative Jade                  | `VitaminTagSmallDecorativeJade`                 | `?attr/vtmnTagSmallDecorativeJadeStyle`                 |
| Small Decorative Emerald               | `VitaminTagSmallDecorativeEmerald`              | `?attr/vtmnTagSmallDecorativeEmeraldStyle`              |
| Small Decorative Cobalt                | `VitaminTagSmallDecorativeCobalt`               | `?attr/vtmnTagSmallDecorativeCobaltStyle`               |
| Small Decorative Amethyst              | `VitaminTagSmallDecorativeAmethyst`             | `?attr/vtmnTagSmallDecorativeAmethystStyle`             |
| Small Accent Interactive               | `VitaminTagSmallAccentInteractive`              | `?attr/vtmnTagSmallAccentInteractiveStyle`              |
| Small Alert Interactive                | `VitaminTagSmallAlertInteractive`               | `?attr/vtmnTagSmallAlertInteractiveStyle`               |
| Small Brand Interactive                | `VitaminTagSmallBrandInteractive`               | `?attr/vtmnTagSmallBrandInteractiveStyle`               |
| Small Decorative Gravel Interactive    | `VitaminTagSmallDecorativeGravelInteractive`    | `?attr/vtmnTagSmallDecorativeGravelInteractiveStyle`    |
| Small Decorative Brick Interactive     | `VitaminTagSmallDecorativeBrickInteractive`     | `?attr/vtmnTagSmallDecorativeBrickInteractiveStyle`     |
| Small Decorative Saffron Interactive   | `VitaminTagSmallDecorativeSaffronInteractive`   | `?attr/vtmnTagSmallDecorativeSaffronInteractiveStyle`   |
| Small Decorative Gold Interactive      | `VitaminTagSmallDecorativeGoldInteractive`      | `?attr/vtmnTagSmallDecorativeGoldInteractiveStyle`      |
| Small Decorative Jade Interactive      | `VitaminTagSmallDecorativeJadeInteractive`      | `?attr/vtmnTagSmallDecorativeJadeInteractiveStyle`      |
| Small Decorative Emerald Interactive   | `VitaminTagSmallDecorativeEmeraldInteractive`   | `?attr/vtmnTagSmallDecorativeEmeraldInteractiveStyle`   |
| Small Decorative Cobalt Interactive    | `VitaminTagSmallDecorativeCobaltInteractive`    | `?attr/vtmnTagSmallDecorativeCobaltInteractiveStyle`    |
| Small Decorative Amethyst Interactive  | `VitaminTagSmallDecorativeAmethystInteractive`  | `?attr/vtmnTagSmallDecorativeAmethystInteractiveStyle`  |

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin.<ThemeName>">

    <com.decathlon.android.tags.VitaminTagMediumAccent
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        style="@style/Widget.Vitamin.Tag.Medium.Accent"
        android:text="Tag" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
