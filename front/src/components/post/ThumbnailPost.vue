<script setup>
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
  }
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
        v-if="subTitle.key"
        class="post-sub-title"
      >
        {{ subTitle.prefix + post[subTitle.key] + subTitle.suffix }}
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
    text-overflow: ellipsis;
    white-space: nowrap;
    overflow: hidden;

    .post-title {

    }

    .post-sub-title {
      font-size: 13px;
    }
  }

}
</style>