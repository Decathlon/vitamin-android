# Tag component

## Tag design specs

You can find the design specs on [www.decathlon.design](https://www.decathlon.design)

## Usage with Vitamin Theme

By inheriting the Vitamin theme in your app, you have the `VitaminTag` component or the `Material Chip` component.

```kotlin
implementation("com.decathlon.vitamin:tags:<version>")
```

```xml
<com.decathlon.android.tags.VitaminTagAccent
     android:layout_width="wrap_content"
     android:layout_height="wrap_content"
     android:text="Tag" />
```

or :

```xml
<com.google.android.material.chip.Chip
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    style="@style/Widget.Vitamin.Tag.Accent"
    android:text="Tag" />
```

For adding an icon, you need to use this tag : `app:tagIcon` if you are using a `Vitamin Tag`, or a `app:chipIcon` if you are using a `Material Chip`.
```xml
<com.decathlon.android.tags.VitaminTagAccent
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
    style="@style/Widget.Vitamin.Tag.Accent"
    app:chipIcon="@drawable/ic_vtmn_football_line"
    android:text="Tag" />
```



With the same usage as above, you have multiple tag types available: 

| Tag type                       | Kotlin Class                              | Attribute style                          |
| ------------------------------ | ----------------------------------------- | ---------------------------------------- |
| Accent                         | `VitaminTagAccent`                        | `?attr/tagAccent`                        |
| Alert                          | `VitaminTagAlert`                         | `?attr/tagAlert`                         |
| Brand                          | `VitaminTagBrand`                         | `?attr/tagBrand`                         |
| Decorative Gravel              | `VitaminTagDecorativeGravel`              | `?attr/tagDecorativeGravel`              |
| Decorative Brick               | `VitaminTagDecorativeBrick`               | `?attr/tagDecorativeBrick`               |
| Decorative Saffron             | `VitaminTagDecorativeSaffron`             | `?attr/tagDecorativeSaffron`             |
| Decorative Gold                | `VitaminTagDecorativeGold`                | `?attr/tagDecorativeGold`                |
| Decorative Jade                | `VitaminTagDecorativeJade`                | `?attr/tagDecorativeJade`                |
| Decorative Emerald             | `VitaminTagDecorativeEmerald`             | `?attr/tagDecorativeEmerald`             |
| Decorative Cobalt              | `VitaminTagDecorativeCobalt`              | `?attr/tagDecorativeCobalt`              |
| Decorative Amethyst            | `VitaminTagDecorativeAmethyst`            | `?attr/tagDecorativeAmethyst`            |
| Accent Interactive             | `VitaminTagAccentInteractive`             | `?attr/tagAccentInteractive`             |
| Alert Interactive              | `VitaminTagAlertInteractive`              | `?attr/tagAlertInteractive`              |
| Brand Interactive              | `VitaminTagBrandInteractive`              | `?attr/tagBrandInteractive`              |
| Decorative Gravel Interactive  | `VitaminTagDecorativeGravelInteractive`   | `?attr/tagDecorativeGravelInteractive`   |
| Decorative Brick Interactive   | `VitaminTagDecorativeBrickInteractive`    | `?attr/tagDecorativeBrickInteractive`    |
| Decorative Saffron Interactive | `VitaminTagDecorativeSaffronInteractive`  | `?attr/tagDecorativeSaffronInteractive`  |
| Decorative Gold Interactive    | `VitaminTagDecorativeGoldInteractive`     | `?attr/tagDecorativeGoldInteractive`     |
| Decorative Jade Interactive    | `VitaminTagDecorativeJadeInteractive`     | `?attr/tagDecorativeJadeInteractive`     |
| Decorative Emerald Interactive | `VitaminTagDecorativeEmeraldInteractive`  | `?attr/tagDecorativeEmeraldInteractive`  |
| Decorative Cobalt Interactive  | `VitaminTagDecorativeCobaltInteractive`   | `?attr/tagDecorativeCobaltInteractive`   |
| Decorative Amethyst Interactive| `VitaminTagDecorativeAmethystInteractive` | `?attr/tagDecorativeAmethystInteractive` |

## Usage in standalone

If you don't want to inherit the full Vitamin theme (and all the Vitamin components) on your entire app, you can use this component in standalone.

### Version 1

Inherit the Base Vitamin theme in your app to have the right colors and fonts and link the Vitamin tags styles.
You can now use the tag component as seen previously.

```kotlin
implementation("com.decathlon.vitamin:tags:<version>")
```

```xml
<resources>
    <style name="AppTheme" parent="Base.Theme.Vitamin">
        ...
        <!-- Tags -->
        <item name="tagAccent">@style/Widget.Vitamin.Tag.Accent</item>
        <item name="tagAccentInteractive">@style/Widget.Vitamin.Tag.Accent.Interactive</item>
        <item name="tagAlert">@style/Widget.Vitamin.Tag.Alert</item>
        <item name="tagAlertInteractive">@style/Widget.Vitamin.Tag.Alert.Interactive</item>
        <item name="tagBrand">@style/Widget.Vitamin.Tag.Brand</item>
        <item name="tagBrandInteractive">@style/Widget.Vitamin.Tag.Brand.Interactive</item>
        <item name="tagDecorativeGravel">@style/Widget.Vitamin.Tag.DecorativeGravel</item>
        <item name="tagDecorativeGravelInteractive">
            @style/Widget.Vitamin.Tag.DecorativeGravel.Interactive
        </item>
        <item name="tagDecorativeBrick">@style/Widget.Vitamin.Tag.DecorativeBrick</item>
        <item name="tagDecorativeBrickInteractive">
            @style/Widget.Vitamin.Tag.DecorativeBrick.Interactive
        </item>
        <item name="tagDecorativeSaffron">@style/Widget.Vitamin.Tag.DecorativeSaffron</item>
        <item name="tagDecorativeSaffronInteractive">
            @style/Widget.Vitamin.Tag.DecorativeSaffron.Interactive
        </item>
        <item name="tagDecorativeGold">@style/Widget.Vitamin.Tag.DecorativeGold</item>
        <item name="tagDecorativeGoldInteractive">@style/Widget.Vitamin.Tag.DecorativeGold.Interactive
        </item>
        <item name="tagDecorativeJade">@style/Widget.Vitamin.Tag.DecorativeJade</item>
        <item name="tagDecorativeJadeInteractive">@style/Widget.Vitamin.Tag.DecorativeJade.Interactive
        </item>
        <item name="tagDecorativeEmerald">@style/Widget.Vitamin.Tag.DecorativeEmerald</item>
        <item name="tagDecorativeEmeraldInteractive">
            @style/Widget.Vitamin.Tag.DecorativeEmerald.Interactive
        </item>
        <item name="tagDecorativeCobalt">@style/Widget.Vitamin.Tag.DecorativeCobalt</item>
        <item name="tagDecorativeCobaltInteractive">
            @style/Widget.Vitamin.Tag.DecorativeCobalt.Interactive
        </item>
        <item name="tagDecorativeAmethyst">@style/Widget.Vitamin.Tag.DecorativeAmethyst</item>
        <item name="tagDecorativeAmethystInteractive">
            @style/Widget.Vitamin.Tag.DecorativeAmethyst.Interactive
        </item>
    </style>
</resources>
```

```xml
<com.decathlon.android.tags.VitaminTagAccent
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Tag" />
```

### Version 2

If you don't want to use Vitamin colors and font on all your app, you can directly use the Vitamin theme on the component's parent view.

```kotlin
implementation("com.decathlon.vitamin:vitamin:<version>")
```

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:theme="@style/Theme.Vitamin">

    <com.decathlon.android.tags.VitaminTagAccent
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        style="@style/Widget.Vitamin.Tag.Accent"
        android:text="Tag" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
