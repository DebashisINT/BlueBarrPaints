package com.breezefieldbluebarry.app.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.breezefieldbluebarry.app.AppConstant

@Entity(tableName = AppConstant.RULE_TEMPLATE)
data class RuleTemplateEntity (
    @PrimaryKey(autoGenerate = true) var sl_no: Int = 0,
    @ColumnInfo var rule_template_id:Int = 0,
    @ColumnInfo var rule_template_name:String = ""
)