
package com.eostek.history.ui.animation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

/**
 * Class of UI animation util
 */
public class UIAnimationUtil {

    /**
     * Layout animation
     * 
     * @return
     */

    public static AnimatorSet createTranslationAnimations(View view, float startX, float endX, float startY, float endY) {
        ObjectAnimator animX = ObjectAnimator.ofFloat(view, "translationX", startX, endX);
        ObjectAnimator animY = ObjectAnimator.ofFloat(view, "translationY", startY, endY);
        AnimatorSet animSetXY = new AnimatorSet();
        animSetXY.playTogether(animX, animY);
        return animSetXY;
    }

    /**
     * Get animation to show layout.
     * 
     * @param mStartDelay
     * @param duration
     * @return
     */
    public static LayoutAnimationController getLayoutShowAnimation(int mStartDelay, int duration) {
        int delay = mStartDelay >= 0 ? mStartDelay : 0;
        AnimationSet set = new AnimationSet(true);

        Animation animation = new AlphaAnimation(0f, 1.0f);
        animation.setStartOffset(delay);
        animation.setDuration(duration);
        set.addAnimation(animation);

        animation = new ScaleAnimation(0.3f, 1.0f, 0.3f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setStartOffset(delay);
        animation.setDuration(duration);
        set.addAnimation(animation);

        LayoutAnimationController controller = new LayoutAnimationController(set, 0.35f);
        controller.setOrder(LayoutAnimationController.ORDER_NORMAL);
        return controller;
    }

    /**
     * Get animation to swap layout.
     * 
     * @param mStartDelay
     * @return
     */
    public static LayoutAnimationController getLayoutSwapAnimation(int mStartDelay) {
        int duration = 200;
        int delay = mStartDelay >= 0 ? mStartDelay : 0;
        AnimationSet set = new AnimationSet(true);

        Animation animation = new AlphaAnimation(0f, 1.0f);
        animation.setStartOffset(delay);
        animation.setDuration(duration);
        set.addAnimation(animation);

        animation = new ScaleAnimation(0.3f, 1.0f, 0.3f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setStartOffset(delay);
        animation.setDuration(duration);
        set.addAnimation(animation);

        LayoutAnimationController controller = new LayoutAnimationController(set, 0.35f);
        controller.setOrder(LayoutAnimationController.ORDER_REVERSE);
        return controller;
    }

    /**
     * Get animation of view scale hide.
     * 
     * @param duration
     * @return
     */
    public static AnimationSet getViewScaleHideAnimation(int duration) {
        int dur = duration >= 0 ? duration : 200;
        int delay = 0;
        AnimationSet set = new AnimationSet(true);

        Animation animation = new AlphaAnimation(1.0f, 0f);
        animation.setStartOffset(delay);
        animation.setDuration(dur);
        set.addAnimation(animation);

        animation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setStartOffset(delay);
        animation.setDuration(dur);
        set.addAnimation(animation);

        return set;
    }

    /**
     * Get animation of view show.
     * 
     * @return
     */
    public static AnimationSet getViewShowAnimation() {
        int duration = 300;
        int delay = 0;
        AnimationSet set = new AnimationSet(true);

        Animation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setStartOffset(delay);
        animation.setDuration(duration);
        set.addAnimation(animation);

        return set;
    }

    /**
     * Get animation of view alpha hide.
     * 
     * @return
     */
    public static AnimationSet getViewAlphaHideAnimation() {
        int duration = 150;
        int delay = 0;
        AnimationSet set = new AnimationSet(true);

        Animation animation = new AlphaAnimation(1.0f, 0.0f);
        animation.setStartOffset(delay);
        animation.setDuration(duration);
        set.addAnimation(animation);

        return set;
    }

    /**
     * Get animation of view move.
     * 
     * @return
     */
    public static AnimationSet getViewMoveAnimation() {
        int duration = 200;
        int delay = 0;
        AnimationSet set = new AnimationSet(true);

        Animation animation = new TranslateAnimation(Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF,
                0.0f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
        animation.setStartOffset(delay);
        animation.setDuration(duration);
        set.addAnimation(animation);

        return set;
    }
}
