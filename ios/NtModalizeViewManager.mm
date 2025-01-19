#import <React/RCTViewManager.h>
#import <React/RCTUIManager.h>
#import "RCTBridge.h"

@interface NtModalizeViewManager : RCTViewManager
@end

@implementation NtModalizeViewManager

RCT_EXPORT_MODULE(NtModalizeView)

- (UIView *)view
{
  return [[UIView alloc] init];
}

RCT_EXPORT_VIEW_PROPERTY(color, NSString)

@end
