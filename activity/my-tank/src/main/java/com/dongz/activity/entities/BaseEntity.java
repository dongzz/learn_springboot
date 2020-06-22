package com.dongz.activity.entities;

import com.dongz.activity.enums.Direction;
import com.dongz.activity.enums.ObjType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auth dz
 * @time 2020/6/18 1:11
 * @desc
 */
@Data
@EqualsAndHashCode
public abstract class BaseEntity {
    // 生命值
    int life;
    // 是否存活
    boolean isLive;
    // 位置
    int x,y;
    int width,height;
    // 分组
    ObjType type;
    // 形状
    Rectangle rectangle;

    public boolean isNotMe(BaseEntity entity) {
        return !this.equals(entity);
    }

    public abstract void paint(Graphics g);
}
