<script setup>
import {computed} from "vue";

const props = defineProps({
  post: {
    required: true,
    type: Object,
  },
  onPostClicked: {
    required: true,
    type: Function
  },
  subTitle: {
    type: Object,
    default: () => {},
  }
})

const subTitleTxt = computed(() => {
   return `${props.subTitle?.prefix ?? ''}${props.post?.[props.subTitle?.key] ?? ''}${props.subTitle?.suffix ?? ''}`
})

const clickThumbnail = () => {
  props.onPostClicked(props.post)
}
</script>

<template>
  <div
    class="post"
    @click="clickThumbnail"
  >
    Image
    <div class="post-info-area">
      <div
        v-if="subTitle?.key"
        class="post-sub-title"
      >
        {{ subTitleTxt }}
      </div>
      <div class="post-title">
        {{ post.title }}
      </div>
    </div>
  </div>
</template>

<style lang="scss" scoped>
.post {
  display: flex;
  position: relative;
  flex-direction: column;
  flex: 0 0 100px;
  height: 100px;
  background-color: #c1c1c1;
  cursor: pointer;

  .post-info-area {
    position: absolute;
    bottom: 0;
    width: 100%;
    color: $WHITE-FONT;
    background-color: black;
    opacity: 30%;
    user-select: none;

    .post-title {
      text-overflow: ellipsis;
      white-space: nowrap;
      overflow: hidden;
    }

    .post-sub-title {
      font-family: Pretendard-ExtraLight, Avenir, Helvetica, Arial, sans-serif;
      font-size: 13px;
    }
  }

}
</style>