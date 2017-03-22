package com.rahobbs.beatbox;

/**
 * Created by rachael on 3/21/17.
 */

public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }


    public String getmAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
