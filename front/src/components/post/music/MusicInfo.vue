<script setup>
import {onBeforeMount, reactive} from 'vue';
import axios from 'axios';

const props = defineProps({
  musicId: String,
})

const musicInfo = reactive({})
onBeforeMount(async () => {
  const {data} = await axios.get(`http://localhost:8081/musics/${props.musicId}`)
  Object.assign(musicInfo, data)
})
</script>

<template>
<!-- todo 영역 나누기 -->
  <div class="music-info">
    <div class="key-info">
      <div class="music-img">
        Music Thumbnail
      </div>
      <div class="info-list">
        {{ musicInfo }}
      </div>
    </div>
  </div>
</template>

<style scoped lang="scss">
.music-info {
  display: flex;

  .key-info {
    display: flex;
    flex: 0 1 50%;

    .music-img {
      background: #92a9bd;
      flex: 0 0 198px;
      height: 198px;
    }

    .info-list {
      flex: 1 1 0;
      padding: 10px;
    }
  }
}
</style>