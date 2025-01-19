# Modalize

## Installation

```bash
yarn add react-native-modalize react-native-gesture-handler
```

<details>
  <summary>iOS</summary>

```bash
npx pod-install ios
```

</details>

<details>
  <summary>Android</summary>

#### React Native > 0.60

You don't need to follow the guide mentioned above because autolinking from React already did the steps.

</details>

## Usage

Here is a quick example, using the default ScrollView renderer.

```tsx
import React, { useRef } from 'react';
import { View, Text, TouchableOpacity } from 'react-native';
import { Modalize } from 'react-native-nt-modalize';

export const App = () => {
  const modalizeRef = useRef<Modalize>(null);

  const onOpen = () => {
    modalizeRef.current?.open();
  };

  return (
    <>
      <TouchableOpacity onPress={onOpen}>
        <Text>Open the modal</Text>
      </TouchableOpacity>

      <Modalize ref={modalizeRef}>...your content</Modalize>
    </>
  );
};
```

## Documentation

Please check out the full [react-native-modalize documentation available here](https://jeremybarbet.github.io/react-native-modalize) to find all about the props, methods and examples of Modalize's usage. This is a fork version of react-native-modalize
