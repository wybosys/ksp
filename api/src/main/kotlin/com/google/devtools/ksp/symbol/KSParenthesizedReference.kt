/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package com.google.devtools.ksp.symbol

/**
 * A reference within a parenthesis
 */
interface KSParenthesizedReference : KSReferenceElement {
    /**
     * The reference in this parenthesis
     */
    val element: KSReferenceElement
}