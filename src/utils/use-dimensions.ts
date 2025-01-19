import * as React from 'react';
import { Dimensions } from 'react-native';
import type { EmitterSubscription, ScaledSize } from 'react-native';

import { isBelowRN65 } from './libraries';

export const useDimensions = (): ScaledSize => {
  const [dimensions, setDimensions] = React.useState(Dimensions.get('window'));

  const onChange = ({ window }: { window: ScaledSize }): void => {
    setDimensions(window);
  };

  React.useEffect(() => {
    let dimensionChangeListener: EmitterSubscription | null = null;

    if (isBelowRN65) {
      Dimensions.addEventListener('change', onChange);
    } else {
      dimensionChangeListener = Dimensions.addEventListener('change', onChange);
    }

    return () => {
      if (isBelowRN65) {
        // @ts-ignore: removeEventListener is not available in newer versions
        Dimensions.removeEventListener('change', onChange);
      } else {
        dimensionChangeListener?.remove();
      }
    };
  }, []);

  return dimensions;
};
