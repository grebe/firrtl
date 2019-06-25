// See LICENSE for license details.

import firrtl.annotations.Annotation
import delegate firrtl._

package object firrtl {
  delegate for Conversion[AnnotationSeq, Seq[Annotation]] {
    def apply(as: AnnotationSeq): Seq[Annotation] = as.underlying
  }
  delegate for Conversion[Seq[Annotation], AnnotationSeq] {
    def apply(xs: Seq[Annotation]): AnnotationSeq = AnnotationSeq(xs)
  }
  implicit def seqToAnnoSeq(xs: Seq[Annotation]): AnnotationSeq = AnnotationSeq(xs)
  implicit def annoSeqToSeq(as: AnnotationSeq): Seq[Annotation] = as.underlying

  /* Options as annotations compatibility items */
  @deprecated("Use firrtl.stage.TargetDirAnnotation", "1.2")
  type TargetDirAnnotation = firrtl.options.TargetDirAnnotation

  @deprecated("Use firrtl.stage.TargetDirAnnotation", "1.2")
  val TargetDirAnnotation = firrtl.options.TargetDirAnnotation
}
