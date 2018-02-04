package outsmart.electropump;

import android.app.Application;

import com.walmartlabs.ern.container.ElectrodeReactContainer;

/**
 * Created by rudi eros on 2/4/2018.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ElectrodeReactContainer.initialize(this,
                new ElectrodeReactContainer.Config().isReactNativeDeveloperSupport(BuildConfig.DEBUG));
    }
}
