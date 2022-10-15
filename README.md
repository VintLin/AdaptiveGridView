# AdaptiveGridView

![GitHub branch checks state](https://img.shields.io/github/checks-status/VoterLin/AdaptiveGridView/main)
![GitHub Repo stars](https://img.shields.io/github/stars/VoterLin/AdaptiveGridView?style=social)

An Android custom ListView that implements multiple columns and variable sized elements.

Please note that this is currently in a preview state.
This basically means that the API is not fixed and you should expect changes between releases.

### Screenshots:

![screenshot 1]()
![screenshot 2]()

### Usage

Version 2.0.0 includes a major breaking change to the AutoGridView. You now provide
your own adapter to the GridRecyclerViewAdapter constructor instead of extending it.

In your ``build.gradle`` file:

```groovy
```

In your layout xml:

```xml
```

In your activity class:

```kotlin
```

Whenever your adapter changes (add or remove items), the grid will automatically reflect those
changes by subscribing to your adapter changes.

Toggle to enable/disable reordering of elements to better fill the grid

```kotlin
```

### Caveats

* Currently only has good support for items with rowSpan = 2 and columnSpan = 2.
In the near future it will support different layout configurations.

* It will work best if you don't have too many items with different sizes. Ideally less
than 20% of your items are of special sizes, otherwise the library may not find the best
way to accommodate all the items without leaving a lot of empty space behind.

* Row layout is too complex, with many nested LinearLayouts. Move to a more flat layout
with a custom ViewGroup possibly.

### Contributing

* Check out the latest master to make sure the feature hasn't been implemented or the bug hasn't been fixed yet
* Check out the issue tracker to make sure someone already hasn't requested it and/or contributed it
* Fork the project
* Start a feature/bugfix branch
* Commit and push until you are happy with your contribution
* Make sure to add tests for it. This is important so I don't break it in a future version unintentionally.

### Copyright and license

Code and documentation copyright 2022-2027 Voter.
Code released under the [Apache License 2.0](https://raw.githubusercontent.com/VoterLin/AdaptiveGridView/main/LICENSE).
