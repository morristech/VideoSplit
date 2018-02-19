package com.xiaopo.flying.videosplit.layout;

import com.xiaopo.flying.puzzlekit.Line;
import com.xiaopo.flying.puzzlekit.straight.StraightPuzzleLayout;

/**
 * @author wupanjie
 */
public class ThreeLayout extends StraightPuzzleLayout {
  @Override
  public void layout() {
    addLine(0, Line.Direction.VERTICAL, 1f / 2);
    addLine(0, Line.Direction.HORIZONTAL, 1f / 2);
  }
}
