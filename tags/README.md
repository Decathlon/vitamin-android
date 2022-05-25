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

| Tag type                       | Kotlin Class                              | Attribute style                                   |
| ------------------------------ | ----------------------------------------- | ------------------------------------------------- |
| Accent                         | `VitaminTagAccent`                        | `?attr/vtmnTagAccentStyle`                        |
| Alert                          | `VitaminTagAlert`                         | `?attr/vtmnTagAlertStyle`                         |
| Brand                          | `VitaminTagBrand`                         | `?attr/vtmnTagBrandStyle`                         |
| Decorative Gravel              | `VitaminTagDecorativeGravel`              | `?attr/vtmnTagDecorativeGravelStyle`              |
| Decorative Brick               | `VitaminTagDecorativeBrick`               | `?attr/vtmnTagDecorativeBrickStyle`               |
| Decorative Saffron             | `VitaminTagDecorativeSaffron`             | `?attr/vtmnTagDecorativeSaffronStyle`             |
| Decorative Gold                | `VitaminTagDecorativeGold`                | `?attr/vtmnTagDecorativeGoldStyle`                |
| Decorative Jade                | `VitaminTagDecorativeJade`                | `?attr/vtmnTagDecorativeJadeStyle`                |
| Decorative Emerald             | `VitaminTagDecorativeEmerald`             | `?attr/vtmnTagDecorativeEmeraldStyle`             |
| Decorative Cobalt              | `VitaminTagDecorativeCobalt`              | `?attr/vtmnTagDecorativeCobaltStyle`              |
| Decorative Amethyst            | `VitaminTagDecorativeAmethyst`            | `?attr/vtmnTagDecorativeAmethystStyle`            |
| Accent Interactive             | `VitaminTagAccentInteractive`             | `?attr/vtmnTagAccentInteractiveStyle`             |
| Alert Interactive              | `VitaminTagAlertInteractive`              | `?attr/vtmnTagAlertInteractiveStyle`              |
| Brand Interactive              | `VitaminTagBrandInteractive`              | `?attr/vtmnTagBrandInteractiveStyle`              |
| Decorative Gravel Interactive  | `VitaminTagDecorativeGravelInteractive`   | `?attr/vtmnTagDecorativeGravelInteractiveStyle`   |
| Decorative Brick Interactive   | `VitaminTagDecorativeBrickInteractive`    | `?attr/vtmnTagDecorativeBrickInteractiveStyle`    |
| Decorative Saffron Interactive | `VitaminTagDecorativeSaffronInteractive`  | `?attr/vtmnTagDecorativeSaffronInteractiveStyle`  |
| Decorative Gold Interactive    | `VitaminTagDecorativeGoldInteractive`     | `?attr/vtmnTagDecorativeGoldInteractiveStyle`     |
| Decorative Jade Interactive    | `VitaminTagDecorativeJadeInteractive`     | `?attr/vtmnTagDecorativeJadeInteractiveStyle`     |
| Decorative Emerald Interactive | `VitaminTagDecorativeEmeraldInteractive`  | `?attr/vtmnTagDecorativeEmeraldInteractiveStyle`  |
| Decorative Cobalt Interactive  | `VitaminTagDecorativeCobaltInteractive`   | `?attr/vtmnTagDecorativeCobaltInteractiveStyle`   |
| Decorative Amethyst Interactive| `VitaminTagDecorativeAmethystInteractive` | `?attr/vtmnTagDecorativeAmethystInteractiveStyle` |

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
        <!-- Vitamin Tags -->
        <item name="vtmnTagAccentStyle">@style/Widget.Vitamin.Tag.Accent</item>
        <item name="vtmnTagAccentInteractiveStyle">@style/Widget.Vitamin.Tag.Accent.Interactive</item>
        <item name="vtmnTagAlertStyle">@style/Widget.Vitamin.Tag.Alert</item>
        <item name="vtmnTagAlertInteractiveStyle">@style/Widget.Vitamin.Tag.Alert.Interactive</item>
        <item name="vtmnTagBrandStyle">@style/Widget.Vitamin.Tag.Brand</item>
        <item name="vtmnTagBrandInteractiveStyle">@style/Widget.Vitamin.Tag.Brand.Interactive</item>
        <item name="vtmnTagDecorativeGravelStyle">@style/Widget.Vitamin.Tag.DecorativeGravel</item>
        <item name="vtmnTagDecorativeGravelInteractiveStyle">
            @style/Widget.Vitamin.Tag.DecorativeGravel.Interactive
        </item>
        <item name="vtmnTagDecorativeBrickStyle">@style/Widget.Vitamin.Tag.DecorativeBrick</item>
        <item name="vtmnTagDecorativeBrickInteractiveStyle">
            @style/Widget.Vitamin.Tag.DecorativeBrick.Interactive
        </item>
        <item name="vtmnTagDecorativeSaffronStyle">@style/Widget.Vitamin.Tag.DecorativeSaffron</item>
        <item name="vtmnTagDecorativeSaffronInteractiveStyle">
            @style/Widget.Vitamin.Tag.DecorativeSaffron.Interactive
        </item>
        <item name="vtmnTagDecorativeGoldStyle">@style/Widget.Vitamin.Tag.DecorativeGold</item>
        <item name="vtmnTagDecorativeGoldInteractiveStyle">@style/Widget.Vitamin.Tag.DecorativeGold.Interactive
        </item>
        <item name="vtmnTagDecorativeJadeStyle">@style/Widget.Vitamin.Tag.DecorativeJade</item>
        <item name="vtmnTagDecorativeJadeInteractiveStyle">@style/Widget.Vitamin.Tag.DecorativeJade.Interactive
        </item>
        <item name="vtmnTagDecorativeEmeraldStyle">@style/Widget.Vitamin.Tag.DecorativeEmerald</item>
        <item name="vtmnTagDecorativeEmeraldInteractiveStyle">
            @style/Widget.Vitamin.Tag.DecorativeEmerald.Interactive
        </item>
        <item name="vtmnTagDecorativeCobaltStyle">@style/Widget.Vitamin.Tag.DecorativeCobalt</item>
        <item name="vtmnTagDecorativeCobaltInteractiveStyle">
            @style/Widget.Vitamin.Tag.DecorativeCobalt.Interactive
        </item>
        <item name="vtmnTagDecorativeAmethystStyle">@style/Widget.Vitamin.Tag.DecorativeAmethyst</item>
        <item name="vtmnTagDecorativeAmethystInteractiveStyle">
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
